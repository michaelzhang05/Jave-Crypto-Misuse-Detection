package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096\u0002J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/EmptySequence;", "Lkotlin/sequences/Sequence;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/sequences/DropTakeSequence;", "()V", "drop", "n", HttpUrl.FRAGMENT_ENCODE_SET, "iterator", HttpUrl.FRAGMENT_ENCODE_SET, "take", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.g0.d, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class EmptySequence implements Sequence, DropTakeSequence {
    public static final EmptySequence a = new EmptySequence();

    private EmptySequence() {
    }

    @Override // kotlin.sequences.DropTakeSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public EmptySequence a(int i2) {
        return a;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return EmptyIterator.f22038f;
    }
}
