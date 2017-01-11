package com.allstate.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;




@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)
public class MathControllerTest {
    @Autowired
    private MockMvc mvc;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void  shouldSquareAnInteger() throws Exception {
        this.mvc.perform(get("/math/square/4"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.square", is(16)));

    }
    @Test
    public void  shouldFindFactorialOfAnInteger() throws Exception {
        this.mvc.perform(get("/math/factorial/4"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fact", is(24)));

    }

    @Test
    public void  shouldFindFibonacciOfAnInteger() throws Exception {
        this.mvc.perform(get("/math/fibonacci/4"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fibonacci", is(3)));

    }

}