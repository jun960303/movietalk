// x를 누르면 파일 삭제 (이벤트 버블링 이용)
document.querySelectorAll(".uploadResult i").forEach((item) => {
  item.addEventListener("click", (e) => {
    e.preventDefault();

    const li = e.target.closest("li");

    if (confirm("정말로 삭제하시겠습니까?")) {
      // 화면에서 이미지 제거하기
      li.remove();
    }
  });
});

// 삭제를 누르면 파일 삭제 후 리스트로
document.querySelector(".delete").addEventListener("click", (e) => {
  const createForm = document.querySelector("#createForm");

  createForm.action = "/movie/remove";
  createForm.submit();
});
