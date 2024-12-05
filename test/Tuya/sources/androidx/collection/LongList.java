package androidx.collection;

import X5.n;
import X5.o;
import androidx.annotation.IntRange;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import d6.i;
import d6.m;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public abstract class LongList {
    public int _size;
    public long[] content;

    public /* synthetic */ LongList(int i8, AbstractC3151p abstractC3151p) {
        this(i8);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        int i10 = (i9 & 8) != 0 ? -1 : i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        return longList.joinToString(charSequence, charSequence5, charSequence6, i10, charSequence4);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(long j8) {
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (jArr[i9] == j8) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(LongList elements) {
        AbstractC3159y.i(elements, "elements");
        i s8 = m.s(0, elements._size);
        int g8 = s8.g();
        int h8 = s8.h();
        if (g8 <= h8) {
            while (contains(elements.get(g8))) {
                if (g8 != h8) {
                    g8++;
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final long elementAt(@IntRange(from = 0) int i8) {
        if (i8 >= 0 && i8 < this._size) {
            return this.content[i8];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i8);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final long elementAtOrElse(@IntRange(from = 0) int i8, Function1 defaultValue) {
        AbstractC3159y.i(defaultValue, "defaultValue");
        if (i8 >= 0 && i8 < this._size) {
            return this.content[i8];
        }
        return ((Number) defaultValue.invoke(Integer.valueOf(i8))).longValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongList) {
            LongList longList = (LongList) obj;
            int i8 = longList._size;
            int i9 = this._size;
            if (i8 == i9) {
                long[] jArr = this.content;
                long[] jArr2 = longList.content;
                i s8 = m.s(0, i9);
                int g8 = s8.g();
                int h8 = s8.h();
                if (g8 <= h8) {
                    while (jArr[g8] == jArr2[g8]) {
                        if (g8 != h8) {
                            g8++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final long first() {
        if (!isEmpty()) {
            return this.content[0];
        }
        throw new NoSuchElementException("LongList is empty.");
    }

    public final <R> R fold(R r8, n operation) {
        AbstractC3159y.i(operation, "operation");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            r8 = (R) operation.invoke(r8, Long.valueOf(jArr[i9]));
        }
        return r8;
    }

    public final <R> R foldIndexed(R r8, o operation) {
        AbstractC3159y.i(operation, "operation");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Long.valueOf(jArr[i9]));
        }
        return r8;
    }

    public final <R> R foldRight(R r8, n operation) {
        AbstractC3159y.i(operation, "operation");
        long[] jArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return r8;
            }
            r8 = (R) operation.invoke(Long.valueOf(jArr[i8]), r8);
        }
    }

    public final <R> R foldRightIndexed(R r8, o operation) {
        AbstractC3159y.i(operation, "operation");
        long[] jArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return r8;
            }
            r8 = (R) operation.invoke(Integer.valueOf(i8), Long.valueOf(jArr[i8]), r8);
        }
    }

    public final void forEach(Function1 block) {
        AbstractC3159y.i(block, "block");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            block.invoke(Long.valueOf(jArr[i9]));
        }
    }

    public final void forEachIndexed(n block) {
        AbstractC3159y.i(block, "block");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            block.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i9]));
        }
    }

    public final void forEachReversed(Function1 block) {
        AbstractC3159y.i(block, "block");
        long[] jArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 < i8) {
                block.invoke(Long.valueOf(jArr[i8]));
            } else {
                return;
            }
        }
    }

    public final void forEachReversedIndexed(n block) {
        AbstractC3159y.i(block, "block");
        long[] jArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 < i8) {
                block.invoke(Integer.valueOf(i8), Long.valueOf(jArr[i8]));
            } else {
                return;
            }
        }
    }

    public final long get(@IntRange(from = 0) int i8) {
        if (i8 >= 0 && i8 < this._size) {
            return this.content[i8];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i8);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final i getIndices() {
        return m.s(0, this._size);
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += a.a(jArr[i10]) * 31;
        }
        return i9;
    }

    public final int indexOf(long j8) {
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (j8 == jArr[i9]) {
                return i9;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1 predicate) {
        AbstractC3159y.i(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i9]))).booleanValue()) {
                return i9;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1 predicate) {
        AbstractC3159y.i(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 >= i8) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(jArr[i8]))).booleanValue());
        return i8;
    }

    public final boolean isEmpty() {
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this._size != 0) {
            return true;
        }
        return false;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final long last() {
        if (!isEmpty()) {
            return this.content[this._size - 1];
        }
        throw new NoSuchElementException("LongList is empty.");
    }

    public final int lastIndexOf(long j8) {
        long[] jArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 >= i8) {
                return -1;
            }
        } while (jArr[i8] != j8);
        return i8;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(Function1 predicate) {
        AbstractC3159y.i(predicate, "predicate");
        long[] jArr = this.content;
        for (int i8 = this._size - 1; -1 < i8; i8--) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i8]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private LongList(int i8) {
        long[] jArr;
        if (i8 == 0) {
            jArr = LongSetKt.getEmptyLongArray();
        } else {
            jArr = new long[i8];
        }
        this.content = jArr;
    }

    public final boolean any(Function1 predicate) {
        AbstractC3159y.i(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i9]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(Function1 predicate) {
        AbstractC3159y.i(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i10]))).booleanValue()) {
                i9++;
            }
        }
        return i9;
    }

    public final String joinToString(CharSequence separator) {
        AbstractC3159y.i(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final long first(Function1 predicate) {
        AbstractC3159y.i(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            long j8 = jArr[i9];
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return j8;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(prefix, "prefix");
        AbstractC3159y.i(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 transform, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 1) != 0) {
                separator = ", ";
            }
            if ((i9 & 2) != 0) {
                prefix = "";
            }
            if ((i9 & 4) != 0) {
                postfix = "";
            }
            if ((i9 & 8) != 0) {
                i8 = -1;
            }
            if ((i9 & 16) != 0) {
                truncated = "...";
            }
            AbstractC3159y.i(separator, "separator");
            AbstractC3159y.i(prefix, "prefix");
            AbstractC3159y.i(postfix, "postfix");
            AbstractC3159y.i(truncated, "truncated");
            AbstractC3159y.i(transform, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            long[] jArr = longList.content;
            int i10 = longList._size;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    long j8 = jArr[i11];
                    if (i11 == i8) {
                        sb.append(truncated);
                        break;
                    }
                    if (i11 != 0) {
                        sb.append(separator);
                    }
                    sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                    i11++;
                } else {
                    sb.append(postfix);
                    break;
                }
            }
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8) {
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(prefix, "prefix");
        AbstractC3159y.i(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i8, null, 16, null);
    }

    public final long last(Function1 predicate) {
        long j8;
        AbstractC3159y.i(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 < i8) {
                j8 = jArr[i8];
            } else {
                throw new NoSuchElementException("LongList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue());
        return j8;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated) {
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(prefix, "prefix");
        AbstractC3159y.i(postfix, "postfix");
        AbstractC3159y.i(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                long j8 = jArr[i10];
                if (i10 == i8) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append(j8);
                i10++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 transform) {
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(prefix, "prefix");
        AbstractC3159y.i(postfix, "postfix");
        AbstractC3159y.i(truncated, "truncated");
        AbstractC3159y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                long j8 = jArr[i10];
                if (i10 == i8) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                i10++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, Function1 transform) {
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(prefix, "prefix");
        AbstractC3159y.i(postfix, "postfix");
        AbstractC3159y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                long j8 = jArr[i10];
                if (i10 == i8) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                i10++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function1 transform) {
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(prefix, "prefix");
        AbstractC3159y.i(postfix, "postfix");
        AbstractC3159y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                long j8 = jArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                i9++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function1 transform) {
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(prefix, "prefix");
        AbstractC3159y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                long j8 = jArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                i9++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, Function1 transform) {
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                long j8 = jArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                i9++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(Function1 transform) {
        AbstractC3159y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                long j8 = jArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                i9++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
