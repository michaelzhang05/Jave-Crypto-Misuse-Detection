package T6;

import S6.Q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Q f10150a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10151b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10152c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10153d;

    /* renamed from: e, reason: collision with root package name */
    private final long f10154e;

    /* renamed from: f, reason: collision with root package name */
    private final long f10155f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10156g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f10157h;

    /* renamed from: i, reason: collision with root package name */
    private final long f10158i;

    /* renamed from: j, reason: collision with root package name */
    private final List f10159j;

    public i(Q canonicalPath, boolean z8, String comment, long j8, long j9, long j10, int i8, Long l8, long j11) {
        AbstractC3255y.i(canonicalPath, "canonicalPath");
        AbstractC3255y.i(comment, "comment");
        this.f10150a = canonicalPath;
        this.f10151b = z8;
        this.f10152c = comment;
        this.f10153d = j8;
        this.f10154e = j9;
        this.f10155f = j10;
        this.f10156g = i8;
        this.f10157h = l8;
        this.f10158i = j11;
        this.f10159j = new ArrayList();
    }

    public final Q a() {
        return this.f10150a;
    }

    public final List b() {
        return this.f10159j;
    }

    public final long c() {
        return this.f10154e;
    }

    public final int d() {
        return this.f10156g;
    }

    public final Long e() {
        return this.f10157h;
    }

    public final long f() {
        return this.f10158i;
    }

    public final long g() {
        return this.f10155f;
    }

    public final boolean h() {
        return this.f10151b;
    }

    public /* synthetic */ i(Q q8, boolean z8, String str, long j8, long j9, long j10, int i8, Long l8, long j11, int i9, AbstractC3247p abstractC3247p) {
        this(q8, (i9 & 2) != 0 ? false : z8, (i9 & 4) != 0 ? "" : str, (i9 & 8) != 0 ? -1L : j8, (i9 & 16) != 0 ? -1L : j9, (i9 & 32) != 0 ? -1L : j10, (i9 & 64) != 0 ? -1 : i8, (i9 & 128) != 0 ? null : l8, (i9 & 256) == 0 ? j11 : -1L);
    }
}
