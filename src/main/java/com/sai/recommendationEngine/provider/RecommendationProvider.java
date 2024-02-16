package com.sai.recommendationEngine.provider;

import com.sai.recommendationEngine.context.RecommendationContext;
import com.sai.recommendationEngine.service.RecommendationService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RecommendationProvider {

    @Autowired
    private List<RecommendationService> recommendationServices;

    @Autowired
    public void RecommendationService(@NonNull List<RecommendationService> recommendationServices) {
        this.recommendationServices = recommendationServices;
    }

    public RecommendationService getRecommendation(RecommendationContext context) {
        RecommendationService recommendationService = null;
        if (recommendationServices != null) {
            for (RecommendationService service : recommendationServices) {
                if (service.getType().equals(context.getType())) {
                    recommendationService = service;
                }
            }
        }
        return recommendationService;
    }

}
