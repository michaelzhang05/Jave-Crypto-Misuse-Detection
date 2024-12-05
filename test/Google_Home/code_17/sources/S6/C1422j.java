package S6;

import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1422j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9912a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9913b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f9914c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f9915d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f9916e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f9917f;

    /* renamed from: g, reason: collision with root package name */
    private final Long f9918g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f9919h;

    public C1422j(boolean z8, boolean z9, Q q8, Long l8, Long l9, Long l10, Long l11, Map extras) {
        AbstractC3255y.i(extras, "extras");
        this.f9912a = z8;
        this.f9913b = z9;
        this.f9914c = q8;
        this.f9915d = l8;
        this.f9916e = l9;
        this.f9917f = l10;
        this.f9918g = l11;
        this.f9919h = P5.Q.y(extras);
    }

    public final Long a() {
        return this.f9917f;
    }

    public final Long b() {
        return this.f9915d;
    }

    public final boolean c() {
        return this.f9913b;
    }

    public final boolean d() {
        return this.f9912a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f9912a) {
            arrayList.add("isRegularFile");
        }
        if (this.f9913b) {
            arrayList.add("isDirectory");
        }
        if (this.f9915d != null) {
            arrayList.add("byteCount=" + this.f9915d);
        }
        if (this.f9916e != null) {
            arrayList.add("createdAt=" + this.f9916e);
        }
        if (this.f9917f != null) {
            arrayList.add("lastModifiedAt=" + this.f9917f);
        }
        if (this.f9918g != null) {
            arrayList.add("lastAccessedAt=" + this.f9918g);
        }
        if (!this.f9919h.isEmpty()) {
            arrayList.add("extras=" + this.f9919h);
        }
        return AbstractC1378t.w0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ C1422j(boolean z8, boolean z9, Q q8, Long l8, Long l9, Long l10, Long l11, Map map, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) == 0 ? z9 : false, (i8 & 4) != 0 ? null : q8, (i8 & 8) != 0 ? null : l8, (i8 & 16) != 0 ? null : l9, (i8 & 32) != 0 ? null : l10, (i8 & 64) == 0 ? l11 : null, (i8 & 128) != 0 ? P5.Q.h() : map);
    }
}
