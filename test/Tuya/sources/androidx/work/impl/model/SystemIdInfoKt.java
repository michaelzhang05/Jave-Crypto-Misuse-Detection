package androidx.work.impl.model;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class SystemIdInfoKt {
    public static final SystemIdInfo systemIdInfo(WorkGenerationalId generationalId, int i8) {
        AbstractC3159y.i(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.getWorkSpecId(), generationalId.getGeneration(), i8);
    }
}
