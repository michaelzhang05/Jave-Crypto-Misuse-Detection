package cm.aptoide.pt.abtesting;

import rx.Single;

/* loaded from: classes.dex */
public interface ExperimentPersistence {
    Single<ExperimentModel> get(String str);

    rx.b save(String str, Experiment experiment);
}
