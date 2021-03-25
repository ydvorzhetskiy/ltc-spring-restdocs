package com.luxoft.spring.restdocs.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PersonController.class)
@AutoConfigureRestDocs("target/snippets")
class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnPerson() throws Exception {
        this.mockMvc.perform(get("/person/1")).andDo(print())
                .andExpect(status().isOk())
                .andDo(document("home"));
    }
}
