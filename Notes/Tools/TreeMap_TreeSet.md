# TreeMap / TreeSet

相對於 HashMap / HashSet

可以從某個節點往上／往下尋找次一個節點

如果要在一群資料中找上界下界，算是最好用的工具

（PriorityQueue 只能從 head 開始找）

## API

### TreeMap

[CODE](/codes/src/main/java/treeMap/TreeMapExample.java)

- higherEntry(K key)
  - 尋找**大於** key 的 entry
- lowerEntry(K key)
  - 尋找**小於** key 的 entry
- ceilingEntry(K key)
  - 尋找**大於等於** key 的 entry
- floorEntry(K key)
  - 尋找**小於等於** key 的 entry
- firstEntry()
  - 相當於 PQ 的 peek
- pollFirstEntry
  - 相當於 PQ 的 poll
- lastEntry()
  - 最後一個 entry
- pollLastEntry
  - poll 最後一個 entry

### HashSet

[CODE](/codes/src/main/java/treeMap/TreeSetExample.java)

- higher(E element)
  - 尋找**大於** 的 element
- lower(E element)
  - 尋找**小於** 的 element 
- floor(E element)
  - 尋找**大於等於** 的 element
- ceiling(E element)
  - 尋找**小於等於** 的 element
- first()
  - 相當於 PQ 的 peek
- pollFirst
  - 相當於 PQ 的 poll
- last()
  - 最後一個 
- pollLast
  - poll 最後一個 