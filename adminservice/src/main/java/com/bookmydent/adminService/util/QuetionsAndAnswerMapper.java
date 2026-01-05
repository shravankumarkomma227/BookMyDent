package com.bookmydent.adminService.util;

import java.util.List;
import java.util.stream.Collectors;

import com.bookmydent.adminService.dto.QuestionAnswerDTO;
import com.bookmydent.adminService.dto.QuetionsAndAnswerForAddClinicDTO;
import com.bookmydent.adminService.entity.QuestionAnswer;
import com.bookmydent.adminService.entity.QuetionsAndAnswerForAddClinic;

public class QuetionsAndAnswerMapper {

    // DTO → Entity
    public static QuetionsAndAnswerForAddClinic toEntity(QuetionsAndAnswerForAddClinicDTO dto) {
        QuetionsAndAnswerForAddClinic entity = new QuetionsAndAnswerForAddClinic();
        entity.setId(dto.getId());

        List<QuestionAnswer> qaList = dto.getQuestionsAndAnswers().stream()
                .map(qaDto -> new QuestionAnswer(qaDto.getQuestion(), qaDto.isAnswer()))
                .collect(Collectors.toList());

        entity.setQuestionsAndAnswers(qaList);
        return entity;
    }

    // Entity → DTO
    public static QuetionsAndAnswerForAddClinicDTO toDTO(QuetionsAndAnswerForAddClinic entity) {
        QuetionsAndAnswerForAddClinicDTO dto = new QuetionsAndAnswerForAddClinicDTO();
        dto.setId(entity.getId());

        List<QuestionAnswerDTO> qaDtoList = entity.getQuestionsAndAnswers().stream()
                .map(qa -> new QuestionAnswerDTO(qa.getQuestion(), qa.isAnswer()))
                .collect(Collectors.toList());

        dto.setQuestionsAndAnswers(qaDtoList);
        return dto;
    }
}