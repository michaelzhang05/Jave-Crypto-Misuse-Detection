package g6;

import P5.AbstractC1377s;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2882b extends AbstractC1377s {

    /* renamed from: a, reason: collision with root package name */
    private final int f32063a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32064b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32065c;

    /* renamed from: d, reason: collision with root package name */
    private int f32066d;

    public C2882b(char c8, char c9, int i8) {
        this.f32063a = i8;
        this.f32064b = c9;
        boolean z8 = false;
        if (i8 <= 0 ? AbstractC3255y.k(c8, c9) >= 0 : AbstractC3255y.k(c8, c9) <= 0) {
            z8 = true;
        }
        this.f32065c = z8;
        this.f32066d = z8 ? c8 : c9;
    }

    @Override // P5.AbstractC1377s
    public char a() {
        int i8 = this.f32066d;
        if (i8 == this.f32064b) {
            if (this.f32065c) {
                this.f32065c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f32066d = this.f32063a + i8;
        }
        return (char) i8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f32065c;
    }
}
