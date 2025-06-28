graph TD
  subgraph Initialization
    arr[arr]
    target[target]
    left[left = 0]
    right[right = arr.length - 1]
    nullCheck[Check arr != null]
  end

  subgraph Loop
    checkLeftRight[left <= right?]
    mid[mid = left + (right-left)/2]
    checkMidValue[arr[mid] == target?]
    updateLeftRight[Update left/right]
  end

  subgraph Result
    found[Return mid]
    notFound[Return -1]
    error[Throw Exception]
  end

  nullCheck -- Valid --> checkLeftRight
  nullCheck -- Null --> error

  checkLeftRight -- Yes --> mid
  checkLeftRight -- No --> notFound

  mid --> checkMidValue
  checkMidValue -- Yes --> found
  checkMidValue -- No --> updateLeftRight

  updateLeftRight -- arr[mid] < target --> leftUpdate[left = mid + 1]
  updateLeftRight -- arr[mid] > target --> rightUpdate[right = mid - 1]

  leftUpdate --> checkLeftRight
  rightUpdate --> checkLeftRight
