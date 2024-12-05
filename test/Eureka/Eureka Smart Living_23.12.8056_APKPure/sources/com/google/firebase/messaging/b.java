package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes.dex */
abstract class b {

    /* loaded from: classes.dex */
    private static final class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private long f5856a;

        /* renamed from: b, reason: collision with root package name */
        private long f5857b;

        a(InputStream inputStream, long j6) {
            super(inputStream);
            this.f5857b = -1L;
            this.f5856a = j6;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f5856a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i6) {
            ((FilterInputStream) this).in.mark(i6);
            this.f5857b = this.f5856a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f5856a == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f5856a--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f5857b == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f5856a = this.f5857b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j6) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j6, this.f5856a));
            this.f5856a -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i6, int i7) {
            long j6 = this.f5856a;
            if (j6 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i6, (int) Math.min(i7, j6));
            if (read != -1) {
                this.f5856a -= read;
            }
            return read;
        }
    }

    private static byte[] a(Queue queue, int i6) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i6) {
            return bArr;
        }
        int length = i6 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i6);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i6 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static InputStream b(InputStream inputStream, long j6) {
        return new a(inputStream, j6);
    }

    private static int c(long j6) {
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j6 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j6;
    }

    public static byte[] d(InputStream inputStream) {
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue queue, int i6) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i6) * 2));
        while (i6 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i6);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i7 = 0;
            while (i7 < min2) {
                int read = inputStream.read(bArr, i7, min2 - i7);
                if (read == -1) {
                    return a(queue, i6);
                }
                i7 += read;
                i6 += read;
            }
            min = c(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
