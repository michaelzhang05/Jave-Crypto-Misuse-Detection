package B6;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class i extends f implements g {

    /* renamed from: c, reason: collision with root package name */
    public String f1049c;

    /* renamed from: d, reason: collision with root package name */
    public String f1050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i8, String name, String description, String illustrations) {
        super(i8, name);
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(description, "description");
        AbstractC3159y.i(illustrations, "illustrations");
        this.f1049c = description;
        this.f1050d = illustrations;
    }

    @Override // B6.g
    public String a() {
        return this.f1049c;
    }

    @Override // B6.g
    public String b() {
        return this.f1050d;
    }
}
