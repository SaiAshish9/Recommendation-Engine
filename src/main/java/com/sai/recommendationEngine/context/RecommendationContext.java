package com.sai.recommendationEngine.context;

import com.sai.recommendationEngine.enums.RecommendationAction;
import com.sai.recommendationEngine.enums.RecommendationMode;
import com.sai.recommendationEngine.enums.RecommendationType;
import lombok.Data;

@Data
public class RecommendationContext {
   private String id;
   private RecommendationType type;
   private RecommendationMode mode;
   private RecommendationAction action;
}
