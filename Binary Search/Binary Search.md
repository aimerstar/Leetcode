## 基本二元搜尋樹
### [基本有解的情況](<704 Binary Search Best.java>)

| 排序 | 1 | 3 | 4 | 7 | 8 | 10 |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: |
| 位置 | 0 | 1 | 2 | 3 | 4 | 5 |

target:7
#### 第一步 
mid = (0+5)/2 = 2.5 = 2  
target > mid  
left = mid + 1
| 排序 | 1 | 3 | 4 | 7 | 8 | 10 |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: |
|  | L |  | M |  |  | R |
#### 第二步
mid = (3+5)/2 = 4  
target < mid  
right = mid - 1  
| 排序 | 1 | 3 | 4 | 7 | 8 | 10 |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: |
|  |  |  |  | L | M | R |
#### 第三步
mid = (4+4)/2 = 4  
target = mid    
| 排序 | 1 | 3 | 4 | 7 | 8 | 10 |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: |
|  |  |  |  | LR |  |  |
---
### [無解最接近的情況](<35 Search Insert Position Best.java>)
找出>=target最小的數  
| 排序 | 1 | 3 | 4 | 7 | 8 | 10 |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: |
| 位置 | 0 | 1 | 2 | 3 | 4 | 5 |

target:5
#### 第一步 
mid = (0+5)/2 = 2.5 = 2  
target > mid  
left = mid + 1
| 排序 | 1 | 3 | 4 | 7 | 8 | 10 |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: |
|  | L |  | M |  |  | R |
#### 第二步
mid = (3+5)/2 = 4  
target < mid  
right = mid - 1  
| 排序 | 1 | 3 | 4 | 7 | 8 | 10 |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: |
|  |  |  |  | L | M | R |
#### 第三步
mid = (4+4)/2 = 4  
target < mid  
right = mid - 1      
break  
| 排序 | 1 | 3 | 4 | 7 | 8 | 10 |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: |
|  |  |  |  | LR |  |  |

### 當target大於全部數字時  
target:15  
left = 5+1 = 6  
| 排序 | 1 | 3 | 4 | 7 | 8 | 10 |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: |
|  |  |  |  |  |  | LR |

### 當target小於全部數字時  
target:2  
| 排序 | 3 | 4 | 7 | 8 | 10 |
| :--: | :--: | :--: | :--: | :--: | :--: |
|  | L | R |  |  |  |
---