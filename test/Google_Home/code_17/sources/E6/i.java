package E6;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class i extends f implements g {

    /* renamed from: c, reason: collision with root package name */
    public String f2644c;

    /* renamed from: d, reason: collision with root package name */
    public String f2645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i8, String name, String description, String illustrations) {
        super(i8, name);
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(description, "description");
        AbstractC3255y.i(illustrations, "illustrations");
        this.f2644c = description;
        this.f2645d = illustrations;
    }

    @Override // E6.g
    public String a() {
        return this.f2644c;
    }

    @Override // E6.g
    public String b() {
        return this.f2645d;
    }
}
