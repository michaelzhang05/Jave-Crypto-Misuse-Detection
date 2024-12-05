package Q6;

import P6.Q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Q f8353a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8354b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8355c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8356d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8357e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8358f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8359g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f8360h;

    /* renamed from: i, reason: collision with root package name */
    private final long f8361i;

    /* renamed from: j, reason: collision with root package name */
    private final List f8362j;

    public i(Q canonicalPath, boolean z8, String comment, long j8, long j9, long j10, int i8, Long l8, long j11) {
        AbstractC3159y.i(canonicalPath, "canonicalPath");
        AbstractC3159y.i(comment, "comment");
        this.f8353a = canonicalPath;
        this.f8354b = z8;
        this.f8355c = comment;
        this.f8356d = j8;
        this.f8357e = j9;
        this.f8358f = j10;
        this.f8359g = i8;
        this.f8360h = l8;
        this.f8361i = j11;
        this.f8362j = new ArrayList();
    }

    public final Q a() {
        return this.f8353a;
    }

    public final List b() {
        return this.f8362j;
    }

    public final long c() {
        return this.f8357e;
    }

    public final int d() {
        return this.f8359g;
    }

    public final Long e() {
        return this.f8360h;
    }

    public final long f() {
        return this.f8361i;
    }

    public final long g() {
        return this.f8358f;
    }

    public final boolean h() {
        return this.f8354b;
    }

    public /* synthetic */ i(Q q8, boolean z8, String str, long j8, long j9, long j10, int i8, Long l8, long j11, int i9, AbstractC3151p abstractC3151p) {
        this(q8, (i9 & 2) != 0 ? false : z8, (i9 & 4) != 0 ? "" : str, (i9 & 8) != 0 ? -1L : j8, (i9 & 16) != 0 ? -1L : j9, (i9 & 32) != 0 ? -1L : j10, (i9 & 64) != 0 ? -1 : i8, (i9 & 128) != 0 ? null : l8, (i9 & 256) == 0 ? j11 : -1L);
    }
}
