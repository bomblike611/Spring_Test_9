package com.iu.s9;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.iu.member.MemberDAO;
import com.iu.member.MemberDTO;

@Controller
@RequestMapping(value="/ajax/**")
//@ResponseBody - 모든 메서드에 json건 것과 똑같은 효과
public class AjaxController {
	
	@Inject
	private MemberDAO memberDAO;
	
	@RequestMapping(value="select")
	public ModelAndView select(String id) throws Exception{
		MemberDTO memberDTO=memberDAO.selectOne(id);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("member", memberDTO);
		modelAndView.setViewName("ajax/result_1");
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping(value="selectJson")
	public List<MemberDTO> selectJson(String id) throws Exception{
		List<MemberDTO> ar=new ArrayList<MemberDTO>();
		MemberDTO memberDTO=memberDAO.selectOne(id);
		//[{"":"","":"","키":"밸류",[배열]},{"":"","":"","키":"밸류",[배열]}]
		ar.add(memberDTO);
		memberDTO=memberDAO.selectOne("berg");
		ar.add(memberDTO);
		
		
		return ar;
	}
	
	
	@RequestMapping(value="view")
	public void ajaxView(){
			
	}
}
