package androidx.window.embedding;

import P5.AbstractC1378t;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;
    private final Set<ActivityFilter> filters;

    public /* synthetic */ ActivityRule(Set set, boolean z8, int i8, AbstractC3247p abstractC3247p) {
        this(set, (i8 & 2) != 0 ? false : z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        if (AbstractC3255y.d(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand) {
            return true;
        }
        return false;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + androidx.compose.foundation.a.a(this.alwaysExpand);
    }

    public final ActivityRule plus$window_release(ActivityFilter filter) {
        AbstractC3255y.i(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new ActivityRule(AbstractC1378t.b1(linkedHashSet), this.alwaysExpand);
    }

    public ActivityRule(Set<ActivityFilter> filters, boolean z8) {
        AbstractC3255y.i(filters, "filters");
        this.alwaysExpand = z8;
        this.filters = AbstractC1378t.b1(filters);
    }
}
