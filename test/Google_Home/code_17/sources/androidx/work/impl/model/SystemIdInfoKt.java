package androidx.work.impl.model;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class SystemIdInfoKt {
    public static final SystemIdInfo systemIdInfo(WorkGenerationalId generationalId, int i8) {
        AbstractC3255y.i(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.getWorkSpecId(), generationalId.getGeneration(), i8);
    }
}
