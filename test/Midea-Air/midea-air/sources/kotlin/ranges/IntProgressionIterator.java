package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import okhttp3.HttpUrl;

/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", HttpUrl.FRAGMENT_ENCODE_SET, "last", "step", "(III)V", "finalElement", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "getStep", "()I", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.e0.b, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class IntProgressionIterator extends IntIterator {

    /* renamed from: f, reason: collision with root package name */
    private final int f19492f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19493g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19494h;

    /* renamed from: i, reason: collision with root package name */
    private int f19495i;

    public IntProgressionIterator(int i2, int i3, int i4) {
        this.f19492f = i4;
        this.f19493g = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f19494h = z;
        this.f19495i = z ? i2 : i3;
    }

    @Override // kotlin.collections.IntIterator
    public int a() {
        int i2 = this.f19495i;
        if (i2 == this.f19493g) {
            if (this.f19494h) {
                this.f19494h = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f19495i = this.f19492f + i2;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19494h;
    }
}
