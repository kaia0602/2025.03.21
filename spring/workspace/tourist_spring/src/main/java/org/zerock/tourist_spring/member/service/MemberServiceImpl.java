package org.zerock.tourist_spring.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.tourist_spring.member.dto.MemberDTO;
import org.zerock.tourist_spring.member.mapper.MemberMapper;
import org.zerock.tourist_spring.member.vo.MemberVO;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;

    @Override
    public void join(MemberDTO memberDTO) {
        MemberVO memberVO = MemberVO.builder()
                        .id(memberDTO.getId())
                        .email(memberDTO.getEmail())
                        .name(memberDTO.getName())
                        .password(memberDTO.getPassword())
                        .phone(memberDTO.getPhone())
                        .gender(memberDTO.getGender())
                        .agree(memberDTO.isAgree())
                        .content(memberDTO.getContent())
                .build();
        memberMapper.insertMember(memberVO);
    }

    @Override
    public MemberDTO getMember(String id, String password) {
        MemberVO memberVO = MemberVO.builder()
                .id(id)
                .password(password)
                .build();
        memberVO = memberMapper.selectLogin(memberVO);
        MemberDTO memberDTO = null; // vo의 데이터가 null 이라면 dto의 데이터도 null로 설정
        if (memberVO != null) {
             memberDTO = MemberDTO.builder()
                    .id(memberVO.getId())
                    .email(memberVO.getEmail())
                    .name(memberVO.getName())
                    .password(memberVO.getPassword())
                    .phone(memberVO.getPhone())
                    .gender(memberVO.getGender())
                    .agree(memberVO.isAgree())
                    .content(memberVO.getContent())
                    .regidate(memberVO.getRegidate())
                    .build();
        }
            return memberDTO;
    }
}
