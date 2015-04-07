package co.cask.cdap.benchmarks.metrics.emitter;

/**
 *
 */
public class EmitterConfig {

  private final int batchSize;

  public EmitterConfig(int batchSize) {
    this.batchSize = batchSize;
  }

  public int getBatchSize() {
    return batchSize;
  }
}
