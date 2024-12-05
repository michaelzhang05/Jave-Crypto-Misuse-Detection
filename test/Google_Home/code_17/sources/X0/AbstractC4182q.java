package x0;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* renamed from: x0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4182q extends AbstractC4170e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final transient AbstractC4181p f40657a;

    /* renamed from: b, reason: collision with root package name */
    final transient int f40658b;

    /* renamed from: x0.q$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f40659a = AbstractC4164H.c();

        /* renamed from: b, reason: collision with root package name */
        Comparator f40660b;

        /* renamed from: c, reason: collision with root package name */
        Comparator f40661c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4182q(AbstractC4181p abstractC4181p, int i8) {
        this.f40657a = abstractC4181p;
        this.f40658b = i8;
    }

    @Override // x0.AbstractC4169d
    public boolean b(Object obj) {
        if (obj != null && super.b(obj)) {
            return true;
        }
        return false;
    }

    @Override // x0.AbstractC4169d, x0.InterfaceC4157A
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC4181p a() {
        return this.f40657a;
    }

    @Override // x0.AbstractC4169d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // x0.AbstractC4169d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // x0.AbstractC4169d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
