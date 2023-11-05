// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class TakeChallengeRewardCsReqOuterClass {
  /**
   * Protobuf type {@code TakeChallengeRewardCsReq}
   */
  public static final class TakeChallengeRewardCsReq extends ProtoMessage<TakeChallengeRewardCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 group_id = 2;</code>
     */
    private int groupId;

    /**
     * <code>optional uint32 star_count = 13;</code>
     */
    private int starCount;

    private TakeChallengeRewardCsReq() {
    }

    /**
     * @return a new empty instance of {@code TakeChallengeRewardCsReq}
     */
    public static TakeChallengeRewardCsReq newInstance() {
      return new TakeChallengeRewardCsReq();
    }

    /**
     * <code>optional uint32 group_id = 2;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 group_id = 2;</code>
     * @return this
     */
    public TakeChallengeRewardCsReq clearGroupId() {
      bitField0_ &= ~0x00000001;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 2;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 2;</code>
     * @param value the groupId to set
     * @return this
     */
    public TakeChallengeRewardCsReq setGroupId(final int value) {
      bitField0_ |= 0x00000001;
      groupId = value;
      return this;
    }

    /**
     * <code>optional uint32 star_count = 13;</code>
     * @return whether the starCount field is set
     */
    public boolean hasStarCount() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 star_count = 13;</code>
     * @return this
     */
    public TakeChallengeRewardCsReq clearStarCount() {
      bitField0_ &= ~0x00000002;
      starCount = 0;
      return this;
    }

    /**
     * <code>optional uint32 star_count = 13;</code>
     * @return the starCount
     */
    public int getStarCount() {
      return starCount;
    }

    /**
     * <code>optional uint32 star_count = 13;</code>
     * @param value the starCount to set
     * @return this
     */
    public TakeChallengeRewardCsReq setStarCount(final int value) {
      bitField0_ |= 0x00000002;
      starCount = value;
      return this;
    }

    @Override
    public TakeChallengeRewardCsReq copyFrom(final TakeChallengeRewardCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        groupId = other.groupId;
        starCount = other.starCount;
      }
      return this;
    }

    @Override
    public TakeChallengeRewardCsReq mergeFrom(final TakeChallengeRewardCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasStarCount()) {
        setStarCount(other.starCount);
      }
      return this;
    }

    @Override
    public TakeChallengeRewardCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupId = 0;
      starCount = 0;
      return this;
    }

    @Override
    public TakeChallengeRewardCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof TakeChallengeRewardCsReq)) {
        return false;
      }
      TakeChallengeRewardCsReq other = (TakeChallengeRewardCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasStarCount() || starCount == other.starCount);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(starCount);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(starCount);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public TakeChallengeRewardCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // starCount
            starCount = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.starCount, starCount);
      }
      output.endObject();
    }

    @Override
    public TakeChallengeRewardCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2121235933:
          case 2124166370: {
            if (input.isAtField(FieldNames.starCount)) {
              if (!input.trySkipNullValue()) {
                starCount = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public TakeChallengeRewardCsReq clone() {
      return new TakeChallengeRewardCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static TakeChallengeRewardCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new TakeChallengeRewardCsReq(), data).checkInitialized();
    }

    public static TakeChallengeRewardCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakeChallengeRewardCsReq(), input).checkInitialized();
    }

    public static TakeChallengeRewardCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakeChallengeRewardCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating TakeChallengeRewardCsReq messages
     */
    public static MessageFactory<TakeChallengeRewardCsReq> getFactory() {
      return TakeChallengeRewardCsReqFactory.INSTANCE;
    }

    private enum TakeChallengeRewardCsReqFactory implements MessageFactory<TakeChallengeRewardCsReq> {
      INSTANCE;

      @Override
      public TakeChallengeRewardCsReq create() {
        return TakeChallengeRewardCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName starCount = FieldName.forField("starCount", "star_count");
    }
  }
}
