package P6;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1284j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8081a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8082b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f8083c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f8084d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f8085e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f8086f;

    /* renamed from: g, reason: collision with root package name */
    private final Long f8087g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f8088h;

    public C1284j(boolean z8, boolean z9, Q q8, Long l8, Long l9, Long l10, Long l11, Map extras) {
        AbstractC3159y.i(extras, "extras");
        this.f8081a = z8;
        this.f8082b = z9;
        this.f8083c = q8;
        this.f8084d = l8;
        this.f8085e = l9;
        this.f8086f = l10;
        this.f8087g = l11;
        this.f8088h = M5.Q.y(extras);
    }

    public final Long a() {
        return this.f8086f;
    }

    public final Long b() {
        return this.f8084d;
    }

    public final boolean c() {
        return this.f8082b;
    }

    public final boolean d() {
        return this.f8081a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f8081a) {
            arrayList.add("isRegularFile");
        }
        if (this.f8082b) {
            arrayList.add("isDirectory");
        }
        if (this.f8084d != null) {
            arrayList.add("byteCount=" + this.f8084d);
        }
        if (this.f8085e != null) {
            arrayList.add("createdAt=" + this.f8085e);
        }
        if (this.f8086f != null) {
            arrayList.add("lastModifiedAt=" + this.f8086f);
        }
        if (this.f8087g != null) {
            arrayList.add("lastAccessedAt=" + this.f8087g);
        }
        if (!this.f8088h.isEmpty()) {
            arrayList.add("extras=" + this.f8088h);
        }
        return AbstractC1246t.w0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ C1284j(boolean z8, boolean z9, Q q8, Long l8, Long l9, Long l10, Long l11, Map map, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) == 0 ? z9 : false, (i8 & 4) != 0 ? null : q8, (i8 & 8) != 0 ? null : l8, (i8 & 16) != 0 ? null : l9, (i8 & 32) != 0 ? null : l10, (i8 & 64) == 0 ? l11 : null, (i8 & 128) != 0 ? M5.Q.h() : map);
    }
}
