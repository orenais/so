USE catalogdb;

ALTER TABLE orchestration_flow_reference
DROP FOREIGN KEY fk_orchestration_flow_reference__building_block_detail;