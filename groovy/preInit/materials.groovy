import gregtech.api.unification.material.event.MaterialEvent
import gregtech.api.unification.material.Material

import net.minecraft.util.ResourceLocation

import static gregtech.api.unification.material.info.MaterialFlags.*

event_manager.listen { MaterialEvent event ->
    new Material.Builder(32000, resource('gcp', 'fluix'))
            .gem()
            .color(0x674FAF).iconSet('CERTUS')
            .flags('generate_plate', 'disable_decomposition', 'no_smelting', 'crystallizable')
            .components(material('certus_quartz'), material('nether_quartz'), material('redstone'))
            .build()

    new Material.Builder(32001,  resource('gcp', 'sodium_aluminate'))
                .dust()
                .components(material('aluminium'), material('sodium'), material('oxygen') * 2)
                .colorAverage()
                .build();


    new Material.Builder(32002, resource('gcp', 'aluminium_hydroxide'))
                .dust()
                .components(material('aluminium') * 1, material('oxygen') * 3, material('hydrogen') * 3)
                .colorAverage()
                .build()
                .setFormula("Al(OH)3", true);

    new Material.Builder(32003, resource('gcp', 'alumina'))
                .dust().liquid()
                .flags(GENERATE_PLATE)
                .components(material('aluminium') * 2, material('oxygen') * 3)
                .color(0xd0cff7)
                .build()

    new Material.Builder(32004, resource('gcp', 'cryolite'))
                .dust().liquid()
                .components(material('sodium') * 3, material('aluminium'), material('fluorine') * 6)
                .color(0x2497a6)
                .build();

    new Material.Builder(32005, resource('gcp', 'sodium_hydroxide_solution'))
                .liquid()
                .components(material('sodium_hydroxide'), material('water'))
                .colorAverage()
                .build();

    new Material.Builder(32006, resource('gcp', 'trichlorosilane'))
                .liquid()
                .components( material('silicon'), material('hydrogen'), material('chlorine') * 3)
                .color(0x77979e)
                .build();

    new Material.Builder(32007, resource('gcp', 'solar_grade_silicon'))
                .dust()
                .components(material('silicon'))
                .color(0x3C3C50)
                .build();

    new Material.Builder(32008, resource('gcp', 'sodium_aluminate_solution'))
                .liquid()
                .components(material('sodium_aluminate'),material('water'))
                .color(0x3f71bf)
                .build();

    material('certus_quartz').addFlags('generate_rod', 'generate_bolt_screw')
    material('nether_quartz').addFlags('generate_rod', 'generate_bolt_screw')
    material('iron').addFlags('generate_dense')
    material('brass').addFlags('generate_spring')
}
