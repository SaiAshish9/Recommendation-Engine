package com.sai.recommendationEngine.controller;

import com.sai.recommendationEngine.context.ContentBasedRecommendationContext;
import com.sai.recommendationEngine.context.RecommendationContext;
import com.sai.recommendationEngine.enums.RecommendationAction;
import com.sai.recommendationEngine.enums.RecommendationMode;
import com.sai.recommendationEngine.enums.RecommendationType;
import com.sai.recommendationEngine.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivilegedAction;

@RestController
@RequiredArgsConstructor
public class RecommendationController {

    private final RecommendationService recommendationService;

    @GetMapping("/recommend")
    public void recommended() {
        ContentBasedRecommendationContext context = new ContentBasedRecommendationContext();
        context.setAction(RecommendationAction.COLLECT);
        context.setMode(RecommendationMode.SYNC);
        context.setType(RecommendationType.CONTENT);
        recommendationService.process(context);
    }

}
