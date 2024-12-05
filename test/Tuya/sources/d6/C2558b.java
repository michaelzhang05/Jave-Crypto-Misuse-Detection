package d6;

import M5.AbstractC1245s;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: d6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2558b extends AbstractC1245s {

    /* renamed from: a, reason: collision with root package name */
    private final int f30183a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30184b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30185c;

    /* renamed from: d, reason: collision with root package name */
    private int f30186d;

    public C2558b(char c8, char c9, int i8) {
        this.f30183a = i8;
        this.f30184b = c9;
        boolean z8 = false;
        if (i8 <= 0 ? AbstractC3159y.k(c8, c9) >= 0 : AbstractC3159y.k(c8, c9) <= 0) {
            z8 = true;
        }
        this.f30185c = z8;
        this.f30186d = z8 ? c8 : c9;
    }

    @Override // M5.AbstractC1245s
    public char b() {
        int i8 = this.f30186d;
        if (i8 == this.f30184b) {
            if (this.f30185c) {
                this.f30185c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f30186d = this.f30183a + i8;
        }
        return (char) i8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30185c;
    }
}
