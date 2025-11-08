package top.andro.a_palette.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import top.andro.a_palette.init.ModBlocks;
import top.andro.a_palette.init.ModEntities;
import top.andro.a_palette.init.ModItems;

import java.util.function.IntFunction;

public class ModBoatEntity extends Boat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public ModBoatEntity(EntityType<? extends Boat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ModBoatEntity(Level level, double pX, double pY, double pZ) {
        this(ModEntities.MOD_BOAT.get(), level);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public Item getDropItem() {
        return switch (getModVariant()) {
            case WHITE -> ModItems.WHITE_STAINED_BOAT.get();
            case LIGHT_GRAY -> ModItems.LIGHT_GRAY_STAINED_BOAT.get();
            case GRAY -> ModItems.GRAY_STAINED_BOAT.get();
            case BLACK -> ModItems.BLACK_STAINED_BOAT.get();
            case BROWN -> ModItems.BROWN_STAINED_BOAT.get();
            case RED -> ModItems.RED_STAINED_BOAT.get();
            case ORANGE -> ModItems.ORANGE_STAINED_BOAT.get();
            case YELLOW -> ModItems.YELLOW_STAINED_BOAT.get();
            case LIME -> ModItems.LIME_STAINED_BOAT.get();
            case GREEN -> ModItems.GREEN_STAINED_BOAT.get();
            case CYAN -> ModItems.CYAN_STAINED_BOAT.get();
            case LIGHT_BLUE -> ModItems.LIGHT_BLUE_STAINED_BOAT.get();
            case BLUE -> ModItems.BLUE_STAINED_BOAT.get();
            case PURPLE -> ModItems.PURPLE_STAINED_BOAT.get();
            case MAGENTA -> ModItems.MAGENTA_STAINED_BOAT.get();
            case PINK -> ModItems.PINK_STAINED_BOAT.get();
        };
    }

    public void setVariant(Type pVariant) {this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());}

    public Type getModVariant(){return Type.byId(this.entityData.get(DATA_ID_TYPE));}

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();


        this.entityData.define(DATA_ID_TYPE, Type.WHITE.ordinal());
        /*this.entityData.define(DATA_ID_TYPE, Type.LIGHT_GRAY.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.GRAY.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.BLACK.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.BROWN.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.RED.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.ORANGE.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.YELLOW.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.LIME.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.GREEN.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.CYAN.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.LIGHT_BLUE.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.BLUE.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.PURPLE.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.MAGENTA.ordinal());
        this.entityData.define(DATA_ID_TYPE, Type.PINK.ordinal());*/
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(Type.byName(pCompound.getString("Type")));
        }
    }

    public static enum Type implements StringRepresentable {
        WHITE(ModBlocks.WHITE_STAINED_PLANKS.get(), "white"),
        LIGHT_GRAY(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get(), "light_gray"),
        GRAY(ModBlocks.GRAY_STAINED_PLANKS.get(), "gray"),
        BLACK(ModBlocks.BLACK_STAINED_PLANKS.get(), "black"),
        BROWN(ModBlocks.BROWN_STAINED_PLANKS.get(), "brown"),
        RED(ModBlocks.RED_STAINED_PLANKS.get(), "red"),
        ORANGE(ModBlocks.ORANGE_STAINED_PLANKS.get(), "orange"),
        YELLOW(ModBlocks.YELLOW_STAINED_PLANKS.get(), "yellow"),
        LIME(ModBlocks.LIME_STAINED_PLANKS.get(), "lime"),
        GREEN(ModBlocks.GREEN_STAINED_PLANKS.get(), "green"),
        CYAN(ModBlocks.CYAN_STAINED_PLANKS.get(), "cyan"),
        LIGHT_BLUE(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get(), "light_blue"),
        BLUE(ModBlocks.BLUE_STAINED_PLANKS.get(), "blue"),
        PURPLE(ModBlocks.PURPLE_STAINED_PLANKS.get(), "purple"),
        MAGENTA(ModBlocks.MAGENTA_STAINED_PLANKS.get(), "magenta"),
        PINK(ModBlocks.PINK_STAINED_PLANKS.get(), "pink");


        private final String name;
        private final Block planks;
        public static final StringRepresentable.EnumCodec<ModBoatEntity.Type> CODEC = StringRepresentable.fromEnum(ModBoatEntity.Type::values);
        private static final IntFunction<ModBoatEntity.Type> BY_ID = ByIdMap.continuous(Enum::ordinal, values(), ByIdMap.OutOfBoundsStrategy.ZERO);

        private Type(Block pPlanks, String pName) {
            this.name = pName;
            this.planks = pPlanks;
        }

        public String getSerializedName() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }

        public Block getPlanks() {
            return this.planks;
        }

        public String toString() {
            return this.name;
        }

        public static ModBoatEntity.Type byId(int pId) {
            return BY_ID.apply(pId);
        }

        public static ModBoatEntity.Type byName(String pName) {
            return CODEC.byName(pName, WHITE);
        }
    }
}
