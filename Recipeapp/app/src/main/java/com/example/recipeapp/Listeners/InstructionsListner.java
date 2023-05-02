package com.example.recipeapp.Listeners;

import com.example.recipeapp.Models.InstructionResponse;

import java.util.List;

public interface InstructionsListner {
    void didfetch(List<InstructionResponse> response, String message);
    void didError(String message);
}
