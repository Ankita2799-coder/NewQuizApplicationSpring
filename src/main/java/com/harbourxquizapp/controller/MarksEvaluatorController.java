package com.harbourxquizapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harbourxquizapp.Service.QuestionService;
import com.harbourxquizapp.Service.QuizService;
import com.harbourxquizapp.model.Questions;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/exam")
public class MarksEvaluatorController {
	@Autowired 
	private QuestionService QuestionService;
	@Autowired 
	private QuizService quizService;
	 @PostMapping("/evaluate")
		public ResponseEntity<?> addQuestion(@RequestBody List<Questions> Questiondata)
		{
		 double marksGot=0L;
		 Long correctAnswers=0L;
		 Long attepmted=0L;
			//Questiondata.getQuestions().forEach(question->{
				for(Questions question:Questiondata)
				{
			Questions question1=	QuestionService.getQuestion(question.getQuesId());
			if(question1.getAnswer().equals(question.getGivenAnswer()))
			{
				double markSingle=Double.parseDouble(Questiondata.get(0).getQuiz().getMaxMarks())/Questiondata.size();
				marksGot+=markSingle;
				correctAnswers++;
			}
			if(question.getGivenAnswer()!=null && !question.getGivenAnswer().equals(""))
			{
				attepmted++;
			}
			}
				System.out.println("marksgot"+marksGot+"corectanswers"+correctAnswers+"attempted"+attepmted);
			Map<Object,Object> map=Map.of("marksGot",marksGot,"correctAnswer",correctAnswers,"attempted",attepmted);
				return ResponseEntity.ok(map);
		}
}
