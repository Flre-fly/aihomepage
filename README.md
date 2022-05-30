# aihomepage



## 글을 디비에 업로드 하는법
- html의 stcipt부분에서 editor.getHTML()으로 내용을 얻어낼 수 있다는 사실은 알고있었습니다. 
- 그런데 프론트에서 데이터를 보내는 곳과 분리되어있기 때문에 onsubmit으로 함수를 등록해주고
- 해당 함수로 들어갔을때 안보이는 form에 (작성한 글에 대한)데이터를 입력해두고 그 데이터를 전송하도록 하였습니다.

## 사진을 디비에 업로드 하는법
- 사진을 글과 같은 형태로 submit을 하려고하면 백에서 받은 데이터에 null이 들어옵니다. 
- 이유는 모르겠지만 용량이 커서 null이 들어오는 것 같습니다. 하지만 이유가 뭐가 됐든 base64를 그대로 디비에 업로드할 수 없어서 
- base64->s3에 업로드하고 반환된 url로 바꾸는 작업을 했습니다.
- 이미지 서버로 데이터를 전달하는 기능을 추가하였습니다. addImageBlobHook 이벤트가 호출되면 제가 작성한 함수가 호출되도록요..