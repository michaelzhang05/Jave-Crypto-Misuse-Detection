package kotlin.reflect.x.internal.l0.i;

/* compiled from: ExternalOverridabilityCondition.java */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: ExternalOverridabilityCondition.java */
    /* loaded from: classes2.dex */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* compiled from: ExternalOverridabilityCondition.java */
    /* loaded from: classes2.dex */
    public enum b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    a a();

    b b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar);
}
