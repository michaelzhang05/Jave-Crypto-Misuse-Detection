package com.liulishuo.filedownloader.message;

import e.h.a.k0.f;

/* loaded from: classes2.dex */
public interface BlockCompleteMessage {

    /* loaded from: classes2.dex */
    public static class BlockCompleteMessageImpl extends MessageSnapshot implements BlockCompleteMessage {

        /* renamed from: h, reason: collision with root package name */
        private final MessageSnapshot f17154h;

        public BlockCompleteMessageImpl(MessageSnapshot messageSnapshot) {
            super(messageSnapshot.e());
            if (messageSnapshot.k() == -3) {
                this.f17154h = messageSnapshot;
                return;
            }
            throw new IllegalArgumentException(f.o("can't create the block complete message for id[%d], status[%d]", Integer.valueOf(messageSnapshot.e()), Byte.valueOf(messageSnapshot.k())));
        }

        @Override // com.liulishuo.filedownloader.message.BlockCompleteMessage
        public MessageSnapshot b() {
            return this.f17154h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) 4;
        }
    }

    MessageSnapshot b();
}
