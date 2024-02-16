package com.sai.recommendationEngine.provider;

import com.sai.recommendationEngine.context.ContentBasedRecommendationContext;
import com.sai.recommendationEngine.context.RecommendationContext;
import com.sai.recommendationEngine.executors.ContentBasedRecommendationExecutor;
import com.sai.recommendationEngine.service.RecommendationService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ContentBasedRecommendationProvider {

    @Autowired
    private List<ContentBasedRecommendationExecutor> contentBasedRecommendationExecutors;

    @Autowired
    public void RecommendationService(@NonNull List<ContentBasedRecommendationExecutor> contentBasedRecommendationExecutors) {
        this.contentBasedRecommendationExecutors = contentBasedRecommendationExecutors;
    }

    public ContentBasedRecommendationExecutor getRecommendation(ContentBasedRecommendationContext context) {
        ContentBasedRecommendationExecutor contentBasedRecommendationExecutor = null;
        if (contentBasedRecommendationExecutors != null) {
            for (ContentBasedRecommendationExecutor executor  : contentBasedRecommendationExecutors) {
                if (executor.getAction().equals(context.getAction()) && executor.getMode().equals(context.getMode())) {
                    contentBasedRecommendationExecutor = executor;
                }
            }
        }
        return contentBasedRecommendationExecutor;
    }

}
