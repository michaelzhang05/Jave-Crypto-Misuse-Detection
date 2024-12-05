package B6;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class j extends f {

    /* renamed from: c, reason: collision with root package name */
    public final List f1051c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i8, String name, String description, List purposes, List specialFeatures) {
        super(i8, name);
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(description, "description");
        AbstractC3159y.i(purposes, "purposes");
        AbstractC3159y.i(specialFeatures, "specialFeatures");
        this.f1051c = purposes;
        this.f1052d = specialFeatures;
    }
}
