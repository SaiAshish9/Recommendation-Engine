package com.sai.recommendationEngine.service;

import com.sai.recommendationEngine.context.ContentBasedRecommendationContext;
import com.sai.recommendationEngine.enums.RecommendationType;
import com.sai.recommendationEngine.executors.ContentBasedRecommendationExecutor;
import com.sai.recommendationEngine.provider.ContentBasedRecommendationProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContentBasedRecommendationService implements RecommendationService<ContentBasedRecommendationContext> {

    private final ContentBasedRecommendationProvider contentBasedRecommendationProvider;

    @Override
    public RecommendationType getType() {
        return RecommendationType.CONTENT;
    }

    @Override
    public void process(ContentBasedRecommendationContext context) {
        ContentBasedRecommendationExecutor contentBasedRecommendationExecutor = contentBasedRecommendationProvider.getRecommendation(context);
        contentBasedRecommendationExecutor.process(context);
    }
}
