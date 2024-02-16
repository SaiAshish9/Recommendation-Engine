package com.sai.recommendationEngine.executors;

import com.sai.recommendationEngine.context.ContentBasedRecommendationContext;
import com.sai.recommendationEngine.enums.RecommendationAction;
import com.sai.recommendationEngine.enums.RecommendationMode;

public interface ContentBasedRecommendationExecutor {
   RecommendationMode getMode();
   RecommendationAction getAction();
   void process(ContentBasedRecommendationContext context);
}
