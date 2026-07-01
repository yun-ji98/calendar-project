| 기능 | Method | URL | 설명 |
|---|---|---|---|
| 일정 생성 | POST | /schedules | 새 일정 생성 | 상태 코드 |
| 일정 전체 조회 | GET | /schedules | 전체 일정 조회 | 201 |
| 일정 단건 조회 | GET | /schedules{id} | 특정 일정 조회 | 200 |
| 일정 수정 | PUT | /schedules{id} | 특정 일정 수정 | 200 |
| 일정 삭제 | DELETE | /schedules{id} | 특정 일정 삭제 | 204 |


| 테이블 | 컬럼 | 설명 |
|---|---|---|
| schedules | id | 일정 ID |
| schedules | writer | 글쓴이 |
| schedules | title | 제목 |
| schedules | message | 내용 |
| schedules | creatAt | 생성일 |
| schedules | modifiedAt | 수정일 |
