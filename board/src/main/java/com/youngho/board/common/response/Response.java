package com.youngho.board.common.response;

import lombok.Builder;
import lombok.Getter;

/**
 * <h1>Response</h1>
 * <p>
 *     Response parent Object
 * </p>
 * <p>
 *     게시판 글 엔티티
 * </p>
 * @author younghoCha
 */
@Getter
@Builder
public class Response<T> {

    /**
     * 요청에 대한 응답 메세지
     */
    private String message;

    /**
     * 요청에 대한 응답 데이터
     */
    private T content;

}
