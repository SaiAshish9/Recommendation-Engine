package com.sai.recommendationEngine.service;

import com.sai.recommendationEngine.context.RecommendationContext;
import com.sai.recommendationEngine.enums.RecommendationType;

public interface RecommendationService<T extends RecommendationContext> {
    RecommendationType getType();
    void process(T context);
}
