package E6;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class d extends f implements g {

    /* renamed from: c, reason: collision with root package name */
    public String f2628c;

    /* renamed from: d, reason: collision with root package name */
    public String f2629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i8, String name, String description, String illustrations) {
        super(i8, name);
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(description, "description");
        AbstractC3255y.i(illustrations, "illustrations");
        this.f2628c = description;
        this.f2629d = illustrations;
    }

    @Override // E6.g
    public String a() {
        return this.f2628c;
    }

    @Override // E6.g
    public String b() {
        return this.f2629d;
    }
}
