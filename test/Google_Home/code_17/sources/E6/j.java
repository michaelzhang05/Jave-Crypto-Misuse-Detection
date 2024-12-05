package E6;

import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class j extends f {

    /* renamed from: c, reason: collision with root package name */
    public final List f2646c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i8, String name, String description, List purposes, List specialFeatures) {
        super(i8, name);
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(description, "description");
        AbstractC3255y.i(purposes, "purposes");
        AbstractC3255y.i(specialFeatures, "specialFeatures");
        this.f2646c = purposes;
        this.f2647d = specialFeatures;
    }
}
