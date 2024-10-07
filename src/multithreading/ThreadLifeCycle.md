- Khi mở ứng dụng, bắt đầu với main thread, sau đó main thread sẽ gọi các thread con
![](https://i.imgur.com/JSlFQkd.png)

- Với hệ điều hành, vòng đời của thread có 5 trạng thái cơ bản (Học trong OS):
  + New
  + Runnable
  + Running
  + Blocked
  + Terminated
- Với Java:
  + New: Khởi tạo, chưa start
  + Runnable: Thread đang trong ready queue, đợi để được cấp tài nguyên
  + Blocked: Đang tranh các tài nguyên găng với các thread khác, tài nguyên cấp cho thread nào do OS xử lý
  + Waiting: Đang đợi để được chạy, có thể là đợi kết quả của 1 thread khác
  + Timed waiting: Giống waiting nhưng có time limit
  + Terminated: Đóng thread, có thể đã hoàn thành hoặc không
![](https://i.imgur.com/ENZnwLa.png)


