package com.sai.recommendationEngine.abstractFactory;

import com.sai.recommendationEngine.context.ContentBasedRecommendationContext;
import com.sai.recommendationEngine.executors.ContentBasedRecommendationExecutor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractContentBasedRecommendationExecutor implements ContentBasedRecommendationExecutor {

    @Override
    public void process(ContentBasedRecommendationContext context) {
        handlePreProcess();
        process();
    }

    private void process() {
        log.info("process at AbstractContentBasedRecommendationExecutor");
    }

    abstract protected void handlePreProcess();

}
