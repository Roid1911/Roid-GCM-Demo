# Read Me

https://github.com/Roid1911/Roid-GCM-Demo

Server API Key help
AIzaSyCXY-zeKSSn0Pg3peLlqqbOR_wt5IdFmqQ

Sender ID help
412254755071

application/x-www-form-urlencoded;charset=UTF-8



* url

https://gcm-http.googleapis.com/gcm/send

* head

Content-Type:application/json
Authorization:key=AIzaSyCXY-zeKSSn0Pg3peLlqqbOR_wt5IdFmqQ

* body

{
  "to" : "fngYkBqbYqc:APA91bHcGg1BadaCmsVSdowWIvVgQfSbmv2N24T8ZxUyzR-G8vRaXh6WwvBvBg93248gmPQq8DGkDAoQkoYfaiD-rb_5Mr9UKFcQD5d5ALODAwTQZ0CtTq1QM8dO66e7hJ32U7NTuh1D",
  "content_available" : true,
  "priority" : "high" ,
  "notification" : {
    	"title" : "GCM Roid Test",
		"body" : "Hello Push!!!!",
    "sound" : "default"
  },
  "data" : {
	"title" : "Hello Title !!",
	"message" : "받는 것 테스트"
  }
}