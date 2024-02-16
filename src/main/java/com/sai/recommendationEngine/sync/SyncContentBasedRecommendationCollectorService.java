package com.sai.recommendationEngine.sync;

import com.sai.recommendationEngine.abstractFactory.AbstractContentBasedRecommendationExecutor;
import com.sai.recommendationEngine.context.ContentBasedRecommendationContext;
import com.sai.recommendationEngine.enums.RecommendationAction;
import com.sai.recommendationEngine.enums.RecommendationMode;
import com.sai.recommendationEngine.executors.ContentBasedRecommendationExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SyncContentBasedRecommendationCollectorService extends AbstractContentBasedRecommendationExecutor {

    @Override
    protected void handlePreProcess() {
        log.info("handlePreProcess at SyncContentBasedRecommendationCollectorService");
    }

    @Override
    public RecommendationMode getMode() {
        return RecommendationMode.SYNC;
    }

    @Override
    public RecommendationAction getAction() {
        return RecommendationAction.COLLECT;
    }

}
