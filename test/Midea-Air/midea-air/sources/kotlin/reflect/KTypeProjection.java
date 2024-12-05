package kotlin.reflect;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: KTypeProjection.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/KTypeProjection;", HttpUrl.FRAGMENT_ENCODE_SET, "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.q, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final /* data */ class KTypeProjection {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final KTypeProjection f19503b = new KTypeProjection(null, null);

    /* renamed from: c, reason: collision with root package name */
    private final KVariance f19504c;

    /* renamed from: d, reason: collision with root package name */
    private final KType f19505d;

    /* compiled from: KTypeProjection.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "STAR", "Lkotlin/reflect/KTypeProjection;", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "star", "getStar$annotations", "contravariant", "type", "Lkotlin/reflect/KType;", "covariant", "invariant", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.q$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final KTypeProjection a(KType kType) {
            l.f(kType, "type");
            return new KTypeProjection(KVariance.IN, kType);
        }

        public final KTypeProjection b(KType kType) {
            l.f(kType, "type");
            return new KTypeProjection(KVariance.OUT, kType);
        }

        public final KTypeProjection c() {
            return KTypeProjection.f19503b;
        }

        public final KTypeProjection d(KType kType) {
            l.f(kType, "type");
            return new KTypeProjection(KVariance.INVARIANT, kType);
        }
    }

    /* compiled from: KTypeProjection.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.q$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[KVariance.values().length];
            iArr[KVariance.INVARIANT.ordinal()] = 1;
            iArr[KVariance.IN.ordinal()] = 2;
            iArr[KVariance.OUT.ordinal()] = 3;
            a = iArr;
        }
    }

    public KTypeProjection(KVariance kVariance, KType kType) {
        String str;
        this.f19504c = kVariance;
        this.f19505d = kType;
        if ((kVariance == null) == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* renamed from: a, reason: from getter */
    public final KVariance getF19504c() {
        return this.f19504c;
    }

    /* renamed from: b, reason: from getter */
    public final KType getF19505d() {
        return this.f19505d;
    }

    public final KType c() {
        return this.f19505d;
    }

    public final KVariance d() {
        return this.f19504c;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) other;
        return this.f19504c == kTypeProjection.f19504c && l.a(this.f19505d, kTypeProjection.f19505d);
    }

    public int hashCode() {
        KVariance kVariance = this.f19504c;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KType kType = this.f19505d;
        return hashCode + (kType != null ? kType.hashCode() : 0);
    }

    public String toString() {
        KVariance kVariance = this.f19504c;
        int i2 = kVariance == null ? -1 : b.a[kVariance.ordinal()];
        if (i2 == -1) {
            return "*";
        }
        if (i2 == 1) {
            return String.valueOf(this.f19505d);
        }
        if (i2 == 2) {
            return "in " + this.f19505d;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.f19505d;
    }
}
