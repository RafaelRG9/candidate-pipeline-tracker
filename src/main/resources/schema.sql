-- 1. Current Req Workflow
CREATE TABLE IF NOT EXISTS req_work (
    entry_date DATE PRIMARY KEY,
    applicants INTEGER DEFAULT 0,
    dnr INTEGER DEFAULT 0,
    bg_fails INTEGER DEFAULT 0,
    not_fit_empty INTEGER DEFAULT 0,
    not_fit_interviewed INTEGER DEFAULT 0,
    not_fit_red_band INTEGER DEFAULT 0,
    not_fit_experience INTEGER DEFAULT 0
);

-- 2. Indeed Sourcing Workflow
CREATE TABLE IF NOT EXISTS indeed_sourcing (
    entry_date DATE PRIMARY KEY,
    sourced INTEGER DEFAULT 0,
    contacted INTEGER DEFAULT 0,
    my_info_moves INTEGER DEFAULT 0,
    applied_contacted INTEGER DEFAULT 0,
    applied_declined INTEGER DEFAULT 0,
    applied_my_info INTEGER DEFAULT 0
);

-- 3. Interview Recording Workflow
CREATE TABLE IF NOT EXISTS interviews (
    entry_date DATE PRIMARY KEY,
    total_held INTEGER DEFAULT 0,
    hired INTEGER DEFAULT 0,
    ncns INTEGER DEFAULT 0,
    declined_dnr INTEGER DEFAULT 0,
    declined_bg INTEGER DEFAULT 0,
    declined_not_fit INTEGER DEFAULT 0
);