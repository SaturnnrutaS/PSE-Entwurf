/**
 * 
 */
package edu.kit.easydaq.core;

/**
 * @author stefan
 * 
 * @startuml
 * BuildingBlock <|-down- SensorBlock
 * BuildingBlock <|-down- TransformationBlock
 * BuildingBlock <|-down- PresentationBlock
 * SensorBlock "1" -down- "*" OutPort
 * TransformationBlock "1" -down- "*" OutPort
 * TransformationBlock "1" -down- "*" InPort
 * PresentationBlock "1" -down- "*" InPort
 * Port <|-up- InPort
 * Port <|-up- OutPort
 * InPort "1" -right- "1" OutPort
 * @enduml
 */
 
public class ConfigurationBlock {
	
	
		
	

}
